package com.projectspace.iam.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ResponseDto {
  private Object data;
  private boolean success;
}
