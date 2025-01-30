import React, { Fragment, useState } from "react";
import "@/App.css";

const items = [
  { name: "Aaron", age: 10, desc: "안녕하세요" },
  { name: "Baron", age: 30, desc: "반갑습니다" },
  { name: "Caron", age: 22, desc: "처음뵙겠습니다" },
  { name: "Daron", age: 17, desc: "보고싶었습니다" },
];

function ListItem({
  onClick,
  children,
  desc,
  showInput,
  onKeyup,
  onChange,
  inputValue,
}) {
  return (
    <li>
      {children}
      {showInput ? (
        <input
          onChange={onChange}
          onKeyUp={onKeyup}
          type="text"
          value={inputValue}
        />
      ) : (
        <span onClick={onClick}>{desc}</span>
      )}
    </li>
  );
}

function App() {
  const [showInput, setShowInput] = useState(items.map(() => false));
  const [users, setUsers] = useState(items);
  const [inputValue, setInputValue] = useState(items.map(() => {}));

  const handleClick = (e, idx) => {
    toggleShowInputElment(true, idx);
  }; //

  const handleKeyUp = (e, idx) => {
    if (e.code !== "Enter") return;
    const isConfirmed = window.confirm("정말 수정하시겠습니까?");
    toggleShowInputElment(false, idx);
    isConfirmed && setInputValueToText(e, idx);
  }; //
  const handleOnChange = (e, idx) => {
    const copiedInputValueArray = [...inputValue];
    const new_input_value = e.target.value;
    copiedInputValueArray[idx] = new_input_value;
    setInputValue(copiedInputValueArray);
  };

  const toggleShowInputElment = (isShow, idx) => {
    const copiedShowInputArr = [...showInput];
    copiedShowInputArr[idx] = isShow;

    setShowInput(copiedShowInputArr);
  };

  const setInputValueToText = (e, idx) => {
    const copiedUsers = [...users];
    copiedUsers[idx].desc = e.target.value;

    setUsers(copiedUsers);
  };

  return (
    <>
      <div>
        <ul>
          {users.map(({ name, age, desc }, idx) => (
            <ListItem
              onClick={(e) => handleClick(e, idx)}
              onKeyup={(e) => handleKeyUp(e, idx)}
              onChange={(e) => handleOnChange(e, idx)}
              key={idx}
              desc={desc}
              showInput={showInput[idx]}
              inputValue={inputValue[idx]}
            >{`${name} | ${age} | `}</ListItem>
          ))}
        </ul>
        <ol>
          {/* {items.map(({ name, age, desc }, idx) => (
            <ListItem key={idx}>{`${name} | ${age} | ${desc}`}</ListItem>
          ))} */}
        </ol>
      </div>
    </>
  );
}
export default App;
