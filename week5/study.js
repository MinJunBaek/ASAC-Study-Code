const object = {id: 1, name: 'Aaron', age: 10}
print(object)

function print({id: user_id, name: user_name, age: user_age = 0}){
    console.log(user_id)
    console.log(user_name)
    console.log(user_age)
}



// 배열 비 구조화
const array = [1, 2, 3, 4]
// const [_, second, third, _] = array

function getEntry() {
    return [1, 'Aaron']
}


// 보편적 
// const [string, setString] = useState('초기값')
// const [number, setNumber] = useState(0)

function sum({a, b, c = 0}){
    return a + b + c
}

console.log(sum(1, 2))

// function parse(person){
//     return {
//         id: person.id,
//         name: person.name,
//     }
// }
function parse({id, name, age, address}){
    return {
        id, name,
    }
}
console.log(parse({id: 1, name: 'Aaron', age: 10, address: 'seoul'}))

const users = [
    {name: 'Aaron', age: 10, favor: 'Game'},
    {name: 'Baron', age: 20, favor: 'Book'},
    {name: 'Caron', age: 30, favor: 'Cook'},
]

// map / filter / each / reduce = 함수형 프로그래밍 - 함수를 파라미터로 넘겨 수행

// age가 없이 나오는 방법
// const converted = users.map(({name, favor}, index) => {
//     return {name, favor}
// })

// 수정 최종버전 
const converted = users.map(({name, favor}, index) => ({name, favor}))

console.log(converted)

const converted_example = [
    {name: 'Aaron', favor: 'Game'},
    {name: 'Baron', favor: 'Book'},
    {name: 'Caron', favor: 'Cook'},
]

const filtered = users.filter(({age}, index) => age >= 30)
console.log(filtered)

const goods = [
    {quantity: 10, price: 1000},
    {quantity: 4, price: 3000},
    {quantity: 6, price: 9000},
]

// reduce 이전값과 이후값을 계산

// 버전 1
// const total_price = goods.reduce((previous, next) => {
//     return previous + (next.price * next.quantity)
// }, 0) // 초기값 0

// 버전 2
const total_price = goods.reduce(
    (previous, {price, quantity}) => previous + (price * quantity),
    0
) // 초기값 0

console.log(total_price)

for (let {price, quantity} of goods){
    console.log(price * quantity)
}

goods.forEach(({price, quantity}) => {
    console.log(price * quantity)
})

// 계산된 프로퍼티명(중요함)
const life = {
    favorite_first: 'Game',
    favorite_second: 'Book',
    favorite_third: 'Cook',
    user: { name: 'Aaron', age: 10, favor: 'Game' },
    birthday() { this.user.age += 1 },
    introduce() { console.log(`제 이름은 ${this.user.name}이고, ${this.user.age}살입니다.`) },
  }
  // 접근 방법
  life.user
  life.birthday()

  // 접근방법이 다양함(하는 이유 키값으로 원하는데로 호출가능)
  life['user']
  life['introduce']()

  // Java Reflection : 변수명, 메서드명으로 직접 접근
  for (let number of ['first', 'second', 'third']) {
    console.log(life['favorite_' + number])
  }

  const errors = {
    unauthorized: { status: 401, message: '인증되지 않은 접근 발생 중', priority: 1 },
    not_found: { status: 404, message: '존재하지 않는 페이지에 접근 중', priority: 2 },
    server_error: { status: 500, message: '서버 내 알 수 없는 에러 발생', priority: 0 },
  }
  
  /*
  try {
    throw new Error('unhandled_error')
  } catch(e) {
    const error = errors[e.message]
    console.log(`에러가 발생했습니다 : ${error?.message === undefined ? '알수없음' : error.message}`) // ? 케스 케이딩이 됨
    console.log(`- 위 에러의 우선순위는 ${error?.priority === undefined ? '알수없음' : error.message}이며,`)
    console.log(`- HTTP Status는 ${error?.status === undefined ? '알수없음' : error.message}로 반환하였습니다.`)
  }
  */

  // 짧게 바꾼 버전
//   try {
//     throw new Error('unhandled_error')
//   } catch(e) {
//     const error = errors[e.message]
//     console.log(`에러가 발생했습니다 : ${error?.message ?? '알수없음'}`) // ? 케스 케이딩이 됨
//     console.log(`- 위 에러의 우선순위는 ${error?.priority ?? '알수없음'}이며,`)
//     console.log(`- HTTP Status는 ${error?.status ?? '알수없음'}로 반환하였습니다.`)
//   }

  // 또다른 버전
  const UNKNOWN_ERROR = {message: '알수없음', prioriry: '알수없음', status: '알수없음'}
  try {
    throw new Error('unhandled_error')
  } catch(e) {
    const error = errors[e.message] ?? UNKNOWN_ERROR
    console.log(`에러가 발생했습니다 : ${error?.message}`) // ? 케스 케이딩이 됨
    console.log(`- 위 에러의 우선순위는 ${error?.priority}이며,`)
    console.log(`- HTTP Status는 ${error?.status}로 반환하였습니다.`)
  }