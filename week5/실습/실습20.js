// 네이노옴!!!
function currency_exchanger(initial_value, type) {
  let money = initial_value;

  let rate = exchange_rate(type.toUpperCase());

  function setMoney(newMoney) {
    money = newMoney;
  }

  function getMoney() {
    return money * rate;
  }

  return [setMoney, getMoney];
}

function exchange_rate(type) {
  switch (type) {
    case "USD":
      return 1500; // = 1달러
    case "JPY":
      return 10; // = 1엔
    case "THB":
      return 40; // = 1바트
  }
}

const [setUSD, getUSDtoKRW] = currency_exchanger(1000, "USD");
console.log(getUSDtoKRW());
setUSD(1230);
console.log(getUSDtoKRW());

const [setJPY, getJPYtoKRW] = currency_exchanger(1000, "JPY");
console.log(getJPYtoKRW());
setJPY(1230);
console.log(getJPYtoKRW());

const [setTHB, getTHBtoKRW] = currency_exchanger(1000, "THB");
console.log(getTHBtoKRW());
setTHB(1230);
console.log(getTHBtoKRW());
