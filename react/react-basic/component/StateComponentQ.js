import {useState} from "react";

const StateComponentQ= () => {
  
  const [count,setCount] = useState(0);
  
  return(
    <div>
      <h1>실습</h1>
      <h1>카운트 : {count}</h1>
      <button onClick={()=>setCount(count+1)}>증가</button>
      <button onClick={()=>setCount(count-1)}>감소</button>
      <button onClick={()=>setCount(0)}>초기화</button>

    </div>
  )

}

export default StateComponentQ