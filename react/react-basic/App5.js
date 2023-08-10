import { Fragment } from "react"
import IterationComponent from "./component/IterationComponent"
import IterationComponent2 from "./component/IterationComponet2"
import IterationComponentQ from "./component/IterationComponentQ"
import IterationComponentQ_ from "./component/IterationComponentQ_"
import IterationComponentQ2 from "./component/IterationComponentQ2"


function App(){


  return(
    <Fragment>
      <IterationComponent/>
      <hr/>
      <IterationComponent2/>
      <hr/>
      <IterationComponentQ/>
      <hr/>
      
      {/* <IterationComponentQ_/> */}
      <hr/>
      <IterationComponentQ2/>
    </Fragment>
  )

}

export default App