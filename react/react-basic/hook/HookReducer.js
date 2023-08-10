import { useReducer } from "react";

//1.리듀서 함수 (state값, 리듀서 실행함수로 전달하는 상태값)
const myReducer = (state,action) => {
  
  console.log(state);
  console.log(action);
  if(action.x === 'increase'){
    state = {value: state.value + 1};
  }else if(action.x ==='decrease'){
    state = {value:state.value-1};
  }else{
    state = {value:0};
  }
  return state;
}

function HookReducer(){

  //2. const [현재state, 리듀서실행함수] = 리듀서 훅 (리듀서 함수, state초기값)
  const [state, func] = useReducer(myReducer,{value:0})
  
  const handleClick = () => {
    // 리듀서 함수를 실행
    func({x:'increase'});

  }

  return(
    <div>
      <h1>실습</h1>
      <h1>카운트 : {state.value} </h1>
      <button onClick={handleClick}>증가</button>
      <button onClick={()=>func({x:'decrease'})}>감소</button>
      <button onClick={()=>func({x:'reset'})}>초기화</button>

    </div>
  )
}
export default HookReducer