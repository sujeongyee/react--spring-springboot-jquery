import {  useState } from "react";


const IterationComponentQ2 = () => {
    //1 - select는 컴포넌트반복으로 option태그를 생성합니다.
    const select = ['HTML', 'Javascript', 'CSS', 'Java', 'Oracle', 'Mysql'];
    const list = select.map((item,index)=> <option key = {index} >{item}</option>);
    //2 - 아래 데이터는 state로 관리하고 화면에 li태그로 반복해주세요 .
    const data = [
        {id: 1, type: 'Java', teacher: '이순신'},
        {id: 2, type: 'Java', teacher: '홍길자'},
        {id: 3, type: 'Javascript', teacher: '홍길동'},
        {id: 4, type: 'Oracle', teacher: '이순신'},
        {id: 5, type: 'Mysql', teacher: '이순신'},
        {id: 6, type: 'CSS', teacher: '박찬호'},
        {id: 7, type: 'HTML', teacher: 'coding404'},
    ];
    const list2 = data.map((item,index)=><li key = {index}>{item.type}-{item.teacher}</li>);
    const [data_,setData_] = useState(list2);
    //3 - 셀렉트박스가 체인지되면 이벤트객체를 활용해서 선택된 값만 필터링해주세요.
    const handleChange = (e) => {
      const list3 = data.filter(item => item.type===e.target.value).map((item,index)=><li key ={index}>{item.type}-{item.teacher}</li>);   
      setData_(list3);
    }
    const [indata,setIndata] = useState('');
    const handleChange2 = (e) => {
      setIndata(e.target.value);
    }
    const handleClick = () => {
      if(indata ===''){
        alert('값을 입력해주쇼?');
        return;
      }
      const list3 = data.filter(item => 
        item.type.toLowerCase().indexOf(indata.toLowerCase())>-1||
        item.teacher.indexOf(indata)>-1
      );
      if(list3.length===0){
        alert('없어요 있었는데? 아니 없어요');
        return;
      }
      const list4 = list3.map((item,index) => <li key={index}>{item.type}-{item.teacher}</li>);
      setData_(list4);
    }
    const handleClick2=(e)=>{
      if(e.key==='Enter'){
        handleClick();
      }else return;
    }
	//4 - 검색기능

    return (
        <div>
			<hr/>
            <h3>실습</h3>
            Search: <input type="text" onChange={handleChange2}  onKeyUp={handleClick2} />
            <button onClick={handleClick}>검색</button>
            <br/>
            
			과목찾기:
            <select onChange={handleChange}>
                {list}
            </select>
            <ul>
               {data_}
            </ul>
        </div>
    )
}

export default IterationComponentQ2;