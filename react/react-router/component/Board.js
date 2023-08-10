import {NavLink, Outlet } from "react-router-dom"


function Board () {

  const myStyle = {
    color:'red',
    backgroundColor:'yellow'
  }
  return(
    <div>
      <h3>Board페이지</h3>
      <ul>
        <li><NavLink to='/board/1' style={({isActive})=>{
          return isActive ? {backgroundColor:'Black' , color:'white'} : undefined;
        }}>1번글</NavLink></li>
        <li><NavLink to='/board/2' style = {({isActive})=>{
          return isActive ? myStyle : undefined;
        }}>2번글</NavLink></li>
        <li><NavLink to='/board/3' style = {({isActive}) => isActive ? myStyle:undefined}>3번글</NavLink></li>
      </ul>

      <Outlet/>
    </div>
  )
}
export default Board