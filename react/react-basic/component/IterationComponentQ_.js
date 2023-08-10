import { useState } from "react"

function IterationComponentQ_(){

  const arr = [
    {src : '/img/img1.png', title : '아이폰10', price: 1000},
    {src : '/img/img2.png', title : '아이폰11', price: 2000},
    {src : '/img/img3.png', title : '아이폰12', price: 3000},
    {src : '/img/img4.png', title : '아이폰13', price: 4000},
  ]
  //1. arr을 state로 관리
  const [list,setList] = useState(arr);
  //2. img를 관리할 state변수
  const [img,setImg] = useState('/img/img1.png')

  //3. 이벤트
  const handleClick = (e) => {
    if(e.target.tagName!=='IMG'){
      return;
    }
    setImg(e.target.src);
  }


  const newList = list.map((item,index) =>
    <div key = {index} onClick={handleClick}>
      <img src = {item.src} width="100" alt = {item.title}/>
      <p>상품: {item.title}</p>
      <p>가격: {item.price}</p>
    </div>    
  )

  return (
    <div>
      <h3>데이터 반복해보기</h3>
      <div>
        <img src ={img} alt = "제목" />
      </div>
      <div style = {{display:'flex',justifyContent:'space-around'}}>
      {newList}
      </div>
    </div>

  )
}
export default IterationComponentQ_