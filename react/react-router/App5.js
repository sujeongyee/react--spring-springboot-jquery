import ColorComponent from "./component3/ColorComponent"
import ColorContext from "./context/ContextAPI"


function App () {

  /* provider 하위컴포넌트에 전달한 props값을 제공하는 역할  - value 속성에는 consumer에서 제어할 값이 들어갑니다.*/

  return(
    <div>
      <ColorContext.Provider value={{color:'green'}}>
      <ColorComponent/>
      </ColorContext.Provider>
    </div>
  )
}

export default App