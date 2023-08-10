import { useContext, useRef } from "react";
import UserContext from "../context/ContextAPI2";



function C(){

  const {state,action} = useContext(UserContext);

  //ref 훅
  const inputRef1 = useRef();
  const inputRef2 = useRef();

  const handleClick = () => {
    //provider 값을 외부에서 변경
    //console.log(action);
    action.setUser({id:inputRef1.current.value,
                   name:inputRef2.current.value
                  });
    inputRef1.current.value = '';
    inputRef2.current.value = '';
  }

  return(
    <div>
      C컴포넌트<br/>
      <input type = "text" ref={inputRef1}/><br/>
      <input type = "text" ref={inputRef2}/><br/>
      <button onClick={handleClick}>provider값 변경하기</button><br/>
      {state.id}<br/>
      {state.name}<br/>
    </div>
  )
}
export default C