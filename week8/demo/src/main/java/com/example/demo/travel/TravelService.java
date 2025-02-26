package com.example.demo.travel;

import com.example.demo.exception.DatabaseException;
import com.example.demo.exception.PasswordException;
import com.example.demo.exception.UsernameException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TravelService {

  public void reservation() {
    try {
//      Database database = new Database(null, "9876");
//      Database database = new Database("user", null);
      Database database = new Database("user", "9876");
//      Database database = new Database("admin", "1234");

      database.save("항공권");
      database.save("리조트");
      database.save("수영장");

      log.info("여행 패키지 예약 완료 (항공권 + 리조트 + 수영장)");
    } catch (UsernameException | PasswordException | DatabaseException e) {
      /* 1) 내부 고객(개발자)에게 표기할 에러메세지 */
      log.error("여행 패키지 예약 실패 - (3) 중간에 받아서 처리하기", e);
    } catch (RuntimeException e) {
      /* 1) 내부 고객(개발자)에게 표기할 에러메세지 */
      log.error("여행 패키지 예약 시 알 수 없는 에러 발생 - (3) 중간에 받아서 처리하기", e);
    }
  }
}
