const arr = [1, 2, 3];

// 배열 길이
console.log(arr.length);

// 특정 값이 어느 인덱스에 위치하는지 확인
console.log(arr.indexOf(1));
console.log(arr.lastIndexOf(3));

// 포함하고 있는지 확인
console.log(arr.includes(2));

// 맨 끝에 값을 추가
arr.push(4);

// 맨 끝 값을 제거
arr.pop();

// 맨 앞에 값을 추가
arr.unshift(0);

// 맨 앞의 값을 제거
arr.shift();

// 특정 인덱스의 값을 조회, 수정
console.log(arr[1]);
arr[1] = 4;
console.log(arr[1]);

// 배열인지 판별
Array.isArray(arr);

// 배열 자르기, 원본을 변경시키지 않음
arr.slice(2);
arr.slice(2, 4);
