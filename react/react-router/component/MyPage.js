import { Navigate } from "react-router-dom";


function MyPage () {

  const loginYN = false; // localStorage.getItem("token");

  // const nav = useNavigate();
  // if(!loginYN){
  //   nav('/');
  // }
  //to = 경로, replace = 기록을 남기는지 여부 (true인 경우 기록 x)
  if(!loginYN){
    return <Navigate to='/' replace = {false}/>
  }
  return (
    <div>.
      <h3>여기는 권한이 있는 사람만 접근할 수 있음</h3>
    </div>
  )
}
export default MyPage