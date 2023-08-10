import { Fragment } from "react";
import { Outlet, useNavigate } from "react-router-dom";
import styled from './Header.module.css';


function Header() {
  const nav = useNavigate();
  /* useNavigate 훅 */
  const goHome = () =>{
    nav('/');// 홈으로
  }
  const goBack = () => {
    nav(-1);
  }
  const goFoward = () => {
    nav(1);
  }
  return(
    <Fragment>
      <header className={styled.header}>
        <h3>헤더파일</h3>
        <ul className={styled.ul}>
          <li>목록</li>
          <li>목록</li>
          <li>목록</li>
          <li>목록</li>
        </ul>
        <div>
          <button onClick = {goHome}>홈으로</button>
          <button onClick = {goBack}>뒤로가기</button>
          <button onClick={goFoward}>앞으로</button>
        </div>
      </header>
      <section>
        <Outlet/>
      </section>
    </Fragment>
  )
}
export default Header