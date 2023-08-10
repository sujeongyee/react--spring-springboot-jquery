import axios from "axios"
import {useEffect, useState } from "react";


function App(){

  /*
  npm install axios 설치
  */
  
  const [data,setData] = useState({});
  const handleClick = () => {
    axios.get('https://raw.githubusercontent.com/yopy0817/data_example/master/hi.json')
    .then(response => setData(response.data));
  }



  //이 데이터를 화면이 로드될때 axios로 select 태그의 옵션으로 처리해주세요
  //https://raw.githubusercontent.com/yopy0817/data_example/master/by.json
  const [data2,setData2] = useState([]);
  
  useEffect(()=>{
    axios.get('https://raw.githubusercontent.com/yopy0817/data_example/master/by.json')
    .then(item => setData2(item.data))
  },[])
 
  const list = data2.map((item,index) => <option key = {index}>{item.value}</option>);
  

  // async & await
  //1. async 안에서 await을 사용할 수 있다.
  //2. fucntion에 async를 붙이면 리턴이 프로미스가 됩니다.
  //3. 리턴이 promise라면 await을 사용할 수 있고, then을 생략할 수 있음.
  const handleClick2 = async() => {
    /*
    axios.get('https://raw.githubusercontent.com/yopy0817/data_example/master/hi.json')
    .then(data => {
      console.log(1);
      axios.get('https://raw.githubusercontent.com/yopy0817/data_example/master/hello.json')
      .then(data => {
        console.log(3);
        axios.get('https://raw.githubusercontent.com/yopy0817/data_example/master/by.json')
        .then(data => {
          console.log(5)
        })
      })
    })
    console.log(2);  
    console.log(4);   
    console.log(6);
    */
    // 동기적으로 (순차적으로) await 결과 받을때까지 기다릴게!
    const result = await axios.get('https://raw.githubusercontent.com/yopy0817/data_example/master/hi.json')
    console.log(result);
    const result2 = await axios.get('https://raw.githubusercontent.com/yopy0817/data_example/master/hello.json')
    console.log(result2);
    const result3 = await axios.get('https://raw.githubusercontent.com/yopy0817/data_example/master/by.json')
    console.log(result3);
  }

  
  return(
    <div>
      <h3>엑시오스 사용하기</h3>

      
      <button onClick={handleClick}>데이터가져오기</button><br/>
      <button onClick={handleClick2}>어싱크확인하기</button><br/>

      {data.userId}<br/>
      {data.userPw}<br/>
      {data.userName}<br/>

      <select>       
        {list}        
      </select>
    </div>
  )
}

export default App