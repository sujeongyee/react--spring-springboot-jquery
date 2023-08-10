import { useLocation, useSearchParams } from "react-router-dom"


function User(){

  //쿼리스트링 값을 받는 방법1
  const location = useLocation();
  //console.log(location);

  //쿼리스트링 값을 받는 방법2 - 
  //첫번째인덱스-set,get가진 객체, 
  //두번째인덱스-쿼리스트링을 직접변경할 수 있는 함수
  const [obj,setObj] = useSearchParams();

  console.log(obj.get('name'));
  let id =obj.get("id"); // request.getParameter("키");
  let name =obj.get("name");
  obj.append('언니','바보');
  let 언니 = obj.get("언니");
  const handleClick = () => {
    setObj({id:'변경' , name : '변경'});
  }
  return(
    <div>
      <h3>유저페이지</h3>
      쿼리스트링id : {id}<br/>
      쿼리스트링name : {name}<br/>
      쿼리스트링언니 : {언니}<br/>
      <button onClick={handleClick}>쿼리스트링제어하기</button>
    </div>
  )
}

export default User