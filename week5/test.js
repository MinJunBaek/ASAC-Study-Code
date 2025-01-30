// const number = 1; → 이후 변수 number 에 2 를 재할당하여라, 되지않는다면 왜인가?
const object = { name: 'Aaron', age: 10 };
const copied_o = object;
const object1 = object;

const object2 = Object.assign({}, object);
object2.name = 'Baron';

object.age = 0;
console.log(object);
console.log(copied_o);

console.log(object1);
console.log(object2);

const array = [1, 2, 3];
// 추가
array.push(4);
console.log(array);
const copied_a = JSON.parse(JSON.stringify(array));
const copied_b = JSON.parse(JSON.stringify(object));

copied_b.age = 30

array.push(5);
console.log(array);
console.log(copied_a);
console.log(copied_b);

console.log(typeof 1 == 'number');
console.log(typeof "abc");
console.log(typeof undefined);
console.log(typeof {});
console.log(typeof []);
console.log(typeof NaN);

console.log(Number.isNaN(NaN));

// 포스트(댓글, ID, 타임 스탬프)
function addCommentToPost(id, comment){
    const newComment = {
        id: id,
        comment: comment,
        createdAt: new Date().toISOString(),
    }
    console.log(`Comment added to post ${id}:`, newComment);
    return newComment;
}

const addedComment = addCommentToPost(3, "처음으로 만들어본다.");
console.log(addedComment);

const generate = ({name, age}) => `안녕하세요 저는 ${name}이고, 나이는 ${age}살입니다.`;
const user = { name: 'Aaron', age: 10 }
const generated = generate(user)
console.log(generated)

let add = (a, b) => a + b
console.log(add(1, 2));

const getPerson = (name) => ({name: name, age: 100})

console.log(getPerson("한", 30));

//실습 5 - 2
const filter = (object) => object.age > 19 && object.specialty === 'backend';
const users = [
	{ name: 'Aaron', age: 10, specialty: 'frontend' },
	{ name: 'Baron', age: 20, specialty: 'backend' },
	{ name: 'Caron', age: 30, specialty: 'engineer' },
]
const filtered = []
for (let i = 0; i < users.length; i++) {
	if (filter(users[i])) {
		filtered.push(users[i])
	}
}
console.log(filtered);

// 실습 5 - 3
const convert = (object) => ({name: object.name})
const user1 = { name: 'Aaron', age: 10 }
const converted = convert(user)
console.log(converted)


console.log('실습 5 끝');

// 실습 6
function convert(user) {
	const converted_user = {}
	return converted_user
}
const result = {
	success: false,
	body: [
		{
			name: 'Aaron',
			age: 10,
			address: null,
		},
		{
			name: 'Baron',
			age: 20,
			address: {
				location: 'Earth'
			},
		},
		{
			name: 'Caron',
			age: 30,
			address: null,
			job: 'Developer',
		},
	]
}
const converted_users = []
for (let i = 0; i < result.body.length; i++) {
	const converted_user = convert(result.body[i])
	converted_users.push(converted_user)
}
console.log(converted_users)

