# java Project
### 한국경영원 인재개발원
### SpringMVC 웹 개발자 과정

##### 2021-01-28

* java 프로그래밍 언어 활용
* 응용SW 엔지니어링
* java 프로그래밍 2일차
* 클래스, 패키지, main() method

##### 2021-02-03
* github를 사용하여 프로젝트 공유하기
*
1. README.md 파일에 내용 추가
*	README 편집하기
*	콜론 ( : ), 세미콜론 ( ; )
*

2. home 폴더에서 github project clone
* home 폴더에서 git bash 열기
* git clone https://github.com/madcow95/repository.git homeworks

3. 집에서 코드 추가, 수정, 삭제 등등..

4. clone한 프로젝트 upload 하기
* config 하기 : clone 한 후 한번만 수행
	git config --global user.name madcow95
	git config --global user.email lobasketve@naver.com
* 프로젝트 압축 및 upload
	git add .
	git commit -m "집에서 HelloHomeWork 클래스 만들기"
	git push or git push -u origin master

5. 학원에 와서 제일 먼저 할 일(가장 중요)
	프로젝트 폴더에서 git bash 열기
	
	git pull(매우 중요) : 동기화 하기


##### git commit 명령 오류 상황
* git commit -m 까지만 입력하면 : error 발생
* git commit 까지만 입력하면 : vi editor

https://github.com/JeaSungLEE/iOSInterviewquestions

https://enevcording.tistory.com/m/entry/%EC%A4%91%EA%B8%B0%EC%B2%AD-%EC%A0%84%EC%84%B8%EC%9E%90%EA%B8%88%EB%8C%80%EC%B6%9C-%EC%8B%A4%EC%A0%9C-%EC%8A%B9%EC%9D%B8-%ED%9B%84%EA%B8%B0-%ED%95%84%EC%9A%94%EC%84%9C%EB%A5%98-%EA%B8%B0%EA%B0%84
https://min-nine.tistory.com/16
https://infoyou.kr/%EC%A4%91%EA%B8%B0%EC%B2%AD-100-%EB%A7%A4%EB%AC%BC-%EC%A1%B0%EA%B1%B4-%EB%B0%8F-%EC%B0%BE%EA%B8%B0-%EA%BF%80%ED%8C%81/
https://m.blog.naver.com/withnaro_/222691818481
https://yelmblog.tistory.com/14
https://www.fmkorea.com/4068555337
https://lkoon.tistory.com/entry/%EC%A4%91%EC%86%8C%EA%B8%B0%EC%97%85%EC%B2%AD%EB%85%84%EC%A0%84%EC%84%B8%EB%8C%80%EC%B6%9C-%EC%A1%B0%EA%B1%B4-%EB%B0%A9%EB%B2%95-%ED%9B%84%EA%B8%B0
https://yeon9218.tistory.com/25
https://cafe.naver.com/lhuniv9
https://binco.tistory.com/entry/%EC%A4%91%EC%86%8C%EA%B8%B0%EC%97%85-%EC%B2%AD%EB%85%84-%EC%A0%84%EC%84%B8%EB%8C%80%EC%B6%9C-%EC%86%94%EC%A7%81%ED%9B%84%EA%B8%B0-%EB%B0%A9%EB%B2%95
https://velog.io/@marisol/SwiftUI-Published-vs-State

RxSwift -> https://babbab2.tistory.com/182

https://cafe.naver.com/lhuniv9/398110
https://cafe.naver.com/lhuniv9?iframe_url=%2Fca-fe%2Fcafes%2F24175469%2Fmenus%2F130%2Farticles%2Fwrite-error
https://80000coding.oopy.io/ddedd7bd-3558-4151-8293-0eea33ae6769

https://double-y.tistory.com/49

https://www.peterpanz.com/house/14085067?utm_source=naver&utm_medium=link

# 23/04/18
@State, @ObservedObject
https://medium.com/harrythegreat/swiftui-%ED%8A%9C%ED%86%A0%EB%A6%AC%EC%96%BC-5%ED%8E%B8-state-binding-observedobject-83c00c3317cb


# 23/05/24
https://velog.io/@hangem422/clean-code-comment -> 주석에 관한 내용
bundle.*.js,out/**/*.*

// 14916, 
func readLine() -> String? {
    return ""
}

import Foundation

func getLottoNumbers() -> [Int] {
    var lottoNumbers = Set<Int>()
    while lottoNumbers.count != 6, let randomNumber = (1...45).randomElement() {
        lottoNumbers.insert(randomNumber)
    }
    return Array(lottoNumbers)
}

func checkLottoNumber(myNumbers: [Int], goal: [Int]) -> [Int] {
    let sameNumbers: [Int] = goal.filter{ myNumbers.contains($0) }
    guard sameNumbers.count > 0 else {
        return []
    }
    return sameNumbers
}

var lottoRecord: [String: [Int]] = [:]

for i in 1...5 {
    lottoRecord["\(i)회차"] = getLottoNumbers()
}

let targetRound = 4
if let targetRoundLotto = lottoRecord["\(targetRound)회차"] {
    print("\(targetRound)회차의 로또 당첨 번호는 \(targetRoundLotto.sorted().map{ String($0) }.joined(separator: ", ")) 입니다.")
} else {
    print("해당 회차의 로또번호가 없습니다.")
}
print(lottoRecord)
