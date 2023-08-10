import { useState } from "react";
import HookEffect from "./hook/HookEffect"
import HookRef from "./hook/HookRef";
import HookQ from "./hook/HookQ";
import IterationComponentQ2 from "./component/IterationComponentQ2";
import HookReducer from "./hook/HookReducer";


function App(){
  //보이기 숨기기
  const [visible,setVisible] = useState(true);

  const handleVisible = () => {
    setVisible(!visible);
  }
  return (
    <div>
      <button onClick={handleVisible}>{visible?'숨기기':'보이기'}</button>
      {visible ? <HookEffect/>:null}
      <hr/>
      <hr/>
      <HookRef/>

      <hr/>
      <HookQ/>
      <hr/>
      <IterationComponentQ2/>
      <hr/>
      <HookReducer/>
    </div>
  )
}

export default App