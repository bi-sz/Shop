package com.shop.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

/* Validation
@NotEmpty - Null 체크 및 문자열 길이(0) 검사
@NotBlank - Null 체크 및 문자열 길이(0) 및 빈 문자열 (" ") 검사
@Length(min=,max=) 최소, 최대 길이 검사
@Email - 이메일 형식 검사
@Max(숫자) @Min(숫자) - 지정 값 대소 검사
@Null - Null 인지 검사
@NotNull - Null 이 아닌지 검사
 */

@Getter
@Setter
public class MemberFormDto {
    @NotBlank(message = "이름은 필수 입력입니다.")
    private String name;
    @NotEmpty(message = "이메일은 필수 입력입니다.")
    @Email(message = "이메일 형식으로 입력해주세요.")
    private String email;

    @NotEmpty(message = "비밀번호는 필수 입력입니다.")
    @Length(min=8, max=16, message = "비밀번호는 8자 이상, 16자 이하로 입력해주세요.")
    private String password;

    @NotEmpty(message = "주소는 필수 입력힙니다.")
    private String address;
}
