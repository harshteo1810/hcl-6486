import React,{useState} from 'react'

function SampleCode() {
    const [counter,setCounter] = useState(20);
    function changeCounter(){
        setCounter(counter+1);
    }
    return (
        <div>
            <h2>Counter value = {counter}</h2>
            <button onClick={changeCounter}>Counter </button>
        </div>
    )
}

export default SampleCode