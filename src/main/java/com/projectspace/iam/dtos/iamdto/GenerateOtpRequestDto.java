package com.projectspace.iam.dtos.iamdto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class GenerateOtpRequestDto {

  private String mobileNumber;

}
