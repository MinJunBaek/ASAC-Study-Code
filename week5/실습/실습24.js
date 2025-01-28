const type = {
  frontend: {
    option: "FRONTEND_DEVELOPER",
    name: "프론트엔드 개발자",
  },
  backend: {
    option: "BACKEND_DEVELOPER",
    name: "백엔드 개발자",
  },
  manager: {
    option: "PRODUCT_MANAGER",
    name: "프로덕트 매니저",
  },
  owner: {
    option: "PRODUCT_OWNER",
    name: "기획자",
  },
  designer: {
    option: "DESIGNER",
    name: "디자이너",
  },
};

class Company {
  constructor(name, hired) {
    (this.name = name),
      (this.hired = hired.map((Employee) =>
        Employee.toUpperCase().replace(" ", "_")
      ));
  }
  checkHiredEmployee(type) {
    const checkEmployee = this.hired.some(
      (Employee) => Employee === type.option
    );
    if (!checkEmployee) {
      return `${this.name} 내에 ${type.name}가 없습니다.`;
    }
    return `${this.name} 내에 ${type.name}가 있습니다.`;
  }
}

const company_a = new Company("A Company", [
  "Frontend Developer",
  "Backend Developer",
  "Product Manager",
  "Product Owner",
  "Designer",
]);
console.log(company_a.checkHiredEmployee(type.frontend));

const company_b = new Company("B Company", [
  "Backend Developer",
  "Product Owner",
  "Designer",
]);
console.log(company_b.checkHiredEmployee(type.frontend));

const company_c = new Company("C Company", [
  "Frontend Developer",
  "Product Manager",
  "Designer",
]);
console.log(company_c.checkHiredEmployee(type.backend));

const company_d = new Company("D Company", [
  "Backend Developer",
  "Product Owner",
]);
console.log(company_d.checkHiredEmployee(type.manager));
