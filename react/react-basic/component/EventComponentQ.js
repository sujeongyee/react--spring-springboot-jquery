import { useState } from "react"


const EventComponentQ = () =>{

  const [sel,setSel] = useState('메뉴를 선택하세요');

  const handleChange = (e) =>{
    setSel(e.target.value);
  }

  return(
    <div>
      <select onChange={handleChange} name = {sel}>
        <option>글레이즈드도넛</option>
        <option>마라탕</option>
        <option>꿔바로우</option>
        <option>엽기떡볶이</option>
        <option>abc초코쿠키</option>
        <option>bbq양념닭다리</option>
        <option>피자스쿨고구마피자</option>
        <option>항정살덮밥</option>
      </select>
      <h1>선택한 결과</h1>
      {sel}
    </div>
  )
}
export default EventComponentQ