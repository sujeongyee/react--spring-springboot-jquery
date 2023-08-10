import { useState } from "react";


function IterationComponentQ(){

  const [img,setImg] = useState('');
  
  const arr = [
    {src : '/img/img1.png', title : '아이폰10', price: 1000},
    {src : '/img/img2.png', title : '아이폰11', price: 2000},
    {src : '/img/img3.png', title : '아이폰12', price: 3000},
    {src : '/img/img4.png', title : '아이폰13', price: 4000},
  ]
  
  const handleChange=(item)=>{
   setImg(item.src);
  }
  const list = arr.map(item=>(<div style = {{display:"inline-block", padding:30}} key={item.src} >
                              <img src ={item.src}  alt='제목' onClick={()=>handleChange(item)}></img><br/> 
                              상품 : {item.title} <br/>가격 : {item.price}원</div>));
  
  return(
    <div>
      <h3>이미지데이터반복해보기</h3>
      <div>
        <img src = {img} alt = "제목"/>
      </div>
      <div >
        {list}
      </div>
    </div>
  )

}
export default IterationComponentQ