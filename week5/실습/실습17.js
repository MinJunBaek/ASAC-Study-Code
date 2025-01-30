const students = [
  {
    student_id: 1,
    name: "A학생",
    assignments: [
      { repo: "a-student/type1", submit: true },
      { repo: "a-student/type2", submit: false },
      { repo: "a-student/type3", submit: true },
      { repo: "a-student/type4", submit: false },
      { repo: "a-student/type5", submit: false },
    ],
    attendance: [
      { date: "2025-02-11", absent: false },
      { date: "2025-02-12", absent: false },
      { date: "2025-02-13", absent: true },
      { date: "2025-02-14", absent: false },
      { date: "2025-02-15", absent: false },
    ],
  },
  {
    student_id: 2,
    name: "B학생",
    assignments: [
      { repo: "b-student/type1", submit: true },
      { repo: "b-student/type2", submit: false },
      { repo: "b-student/type3", submit: false },
      { repo: "b-student/type4", submit: false },
      { repo: "b-student/type5", submit: false },
    ],
    attendance: [
      { date: "2025-02-11", absent: false },
      { date: "2025-02-12", absent: false },
      { date: "2025-02-13", absent: false },
      { date: "2025-02-14", absent: false },
      { date: "2025-02-15", absent: false },
    ],
  },
  {
    student_id: 3,
    name: "C학생",
    assignments: [
      { repo: "c-student/type1", submit: true },
      { repo: "c-student/type2", submit: true },
      { repo: "c-student/type3", submit: true },
      { repo: "c-student/type4", submit: true },
      { repo: "c-student/type5", submit: false },
    ],
    attendance: [
      { date: "2025-02-11", absent: false },
      { date: "2025-02-12", absent: false },
      { date: "2025-02-13", absent: true },
      { date: "2025-02-14", absent: false },
      { date: "2025-02-15", absent: true },
    ],
  },
  {
    student_id: 4,
    name: "D학생",
    assignments: [
      { repo: "d-student/type1", submit: true },
      { repo: "d-student/type2", submit: true },
      { repo: "d-student/type3", submit: true },
      { repo: "d-student/type4", submit: true },
      { repo: "d-student/type5", submit: true },
    ],
    attendance: [
      { date: "2025-02-11", absent: false },
      { date: "2025-02-12", absent: false },
      { date: "2025-02-13", absent: false },
      { date: "2025-02-14", absent: false },
      { date: "2025-02-15", absent: false },
    ],
  },
  {
    student_id: 5,
    name: "E학생",
    assignments: [
      { repo: "e-student/type1", submit: false },
      { repo: "e-student/type2", submit: false },
      { repo: "e-student/type3", submit: false },
      { repo: "e-student/type4", submit: false },
      { repo: "e-student/type5", submit: false },
    ],
    attendance: [
      { date: "2025-02-11", absent: true },
      { date: "2025-02-12", absent: true },
      { date: "2025-02-13", absent: true },
      { date: "2025-02-14", absent: true },
      { date: "2025-02-15", absent: true },
    ],
  },
  {
    student_id: 6,
    name: "F학생",
    assignments: [
      { repo: "f-student/type1", submit: true },
      { repo: "f-student/type2", submit: true },
      { repo: "f-student/type3", submit: true },
      { repo: "f-student/type4", submit: true },
      { repo: "f-student/type5", submit: true },
    ],
    attendance: [
      { date: "2025-02-11", absent: true },
      { date: "2025-02-12", absent: true },
      { date: "2025-02-13", absent: false },
      { date: "2025-02-14", absent: false },
      { date: "2025-02-15", absent: false },
    ],
  },
];

const studentsWhoSubmittedAnyAssignment = students
  .filter((student) =>
    student.assignments.some((assignment) => assignment.submit)
  )
  .map((student) => student.name);

console.log(studentsWhoSubmittedAnyAssignment.join(", "));
