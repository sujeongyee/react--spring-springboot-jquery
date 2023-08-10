import { useEffect, useRef } from "react"


function HookQ(){

  const inputRef = useRef(null);
  const inputRef2 = useRef(null);

  useEffect(()=>{
    inputRef.current.focus();
  },[])

  
  const handleClick = () => {
    if(inputRef.current.value ===''){
      alert('아이디를 입력해주세요');
      inputRef.current.focus();
      return;
    }else if(inputRef2.current.value ===''){
      alert('비밀번호를 입력해주세요');
      inputRef2.current.focus();
      return;
    }
    alert('아이디는 : '+ inputRef.current.value+', 비밀번호는 : '+inputRef2.current.value)
  }
  return(
    <div>
      <h1>실습</h1>
      로그인 클릭시 공백이라면 공백인 태그에 포커스를 추가하세요.<br/>
      로그인 클릭시 공백이 아니라면 경고창으로 입력된 id,pw를 출력해주세요.<br/>
      <span style={{color:"red"}}>첫번째 마운트 이후에는 id에 자동 포커싱 해주세요.</span><br/><br/>
      <input type="text" placeholder="아이디" ref = {inputRef}/><br/>
      <input type="password" placeholder="비밀번호" ref = {inputRef2}/><br/>
      <button onClick={handleClick}>로그인</button>
    </div>
  )
}
export default HookQ