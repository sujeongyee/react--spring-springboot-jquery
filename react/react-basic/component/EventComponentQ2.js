import { useState } from "react"

const EventComponentQ2 = () => {

  const [data,setData] = useState({in:'',out:''});

  const set = (e) =>{
    if(e.target.name==='in'){
      const copy = {...data,[e.target.name]:e.target.value}
      setData(copy);
    }else{     
      const copy = {...data,[e.target.name]:data['in']}
      setData(copy);
    }
  }

  return(
    <div>
      <h1>인풋데이터 핸들링(실습)</h1>
      클릭시 데이터는 공백으로 결과는 인풋이 입력한 값으로 처리<br/>
      힌트는? 아마도 state는 두개가 필요할듯?<br/><br/>
      <input type="text" onChange={set} name = 'in'/>
      <button onClick={set} name = 'out'>추가하기</button>
      <h3>결과</h3>
      {data.out}
    </div>
  )
}
export default EventComponentQ2