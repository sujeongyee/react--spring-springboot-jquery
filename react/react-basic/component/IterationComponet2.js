import { useState } from "react"


function IterationComponent2() {
  //1. state 선언
  const [list,setList] = useState([{id:1, topic:'hello'},
                                   {id:2, topic:'bye'}
                                  ]);
  //2.input value값 state
  const [inputData,setInputData] = useState('');
  //const newList = list.map(item =><li key={item.id} onDoubleClick={(e) => {e.target.remove(); console.log(list)}}>{item.topic}</li>)
  
  //3.input 데이터 핸들링
  const handleChange = (e) => {
    setInputData(e.target.value);
  }
  //4.클릭이벤트 생성
  
  const handleClick = () => {
    // const copy = [...list,{id:list.length+1,topic:inputData}];
    // setList(copy);
    //id는 마지막 아이디보다 큰 숫자
    const obj = [{id:list[list.length-1].id+1, topic: inputData}];
    //기존 배열에 헙참
    //const newData = list.concat(obj);
    const newData = [...list,...obj];
    setList(newData);
    setInputData('');
  }
  //5.삭제이벤트 - 삭제는 id가 필요함
  const handleRemove = (id) => {
    //console.log(id);
    //return에 true가 걸린 요소만 새로운 배열을 만듦
    const result = list.filter((item)=>item.id!== id);
    setList(result);
  }
  const newList = list.map(item =><li key={item.id} onDoubleClick={() => handleRemove(item.id)}>{item.topic}</li>)
  
  return(
    <div>
      <h3>할일 목록 만들기</h3>
      <input type="text" onChange={handleChange} value={inputData} />

      <button type="button" onClick={handleClick}>추가하기</button>

      <ul>
        {newList}
      </ul>


    </div>
  )

}
export default IterationComponent2