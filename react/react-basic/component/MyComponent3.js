


function MyComponent3({title,content,writer}){

  return (
    <div>
      타이틀 : {title}<br/>
      콘텐츠 : {content}<br/>
      작가 : {writer}<br/>
    </div>
  )

}

MyComponent3.defaultProps={
  writer:'박수정'
}


export default MyComponent3