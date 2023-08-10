import { useParams } from "react-router-dom"

function BoardContent() {
  
  const obj = useParams();
  

  return(
    <div>
      <h3>boardContent페이지</h3>
      {obj.num}입니다~
    </div>
  )
}
export default BoardContent