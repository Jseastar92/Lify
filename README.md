# LIFY(커뮤니티)

### Domain별 요구사항

- 사용자
  - 이메일주소와 패스워드로 로그인
  - 레벨 필드와 경험치 필드 있어야함
  - 자신의 취미들을 등록 할 수 있다.  
- 퀘스트 히스토리
  - 미리 정해진 취미 관련 퀘스트
  - 퀘스트는 퀘스트 내용과 보상(경험치)이 있다.
  - 일단 미리 퀘스트를 몇개 정해서 올려두고 사용자가 퀘스트를 선택해서 수행하는 방식으로 함
  - 퀘스트는 레벨별로 관리한다.
  - 추후에 사용자가 퀘스트를 등록 할 수 있다.
- 레벨당 경험치
  - 레벨당 경험치를 DB로 관리한다.
#### 커뮤니티 기능
취미를 기반으로한 커뮤니티
- 게시글
  - 취미를 카테고리로 정해서 게시글을 올릴 수 있다.
- 댓글
  - 게시글에 대한 댓글
  - 대댓글은 1 depth 까지만 허용
  ```
   댓글
     - 댓글(O)
       - 댓글(X)
  ```