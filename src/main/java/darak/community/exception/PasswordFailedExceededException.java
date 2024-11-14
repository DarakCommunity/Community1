package darak.community.exception;

public class PasswordFailedExceededException extends RuntimeException {
    public PasswordFailedExceededException() {
        super("비밀번호 실패 횟수가 5회를 초과하였습니다.");
    }
}
