package com.projectspace.iam.controller;

import com.projectspace.iam.dtos.ResponseDto;
import com.projectspace.iam.dtos.iamdto.GenerateOtpRequestDto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("iam")
public class IamController {

  @PostMapping(path = {"generateOtp"})
  public ResponseEntity<ResponseDto> generateOtp(final @RequestBody GenerateOtpRequestDto generateOtpRequestDto){
    ResponseDto responseDto = new ResponseDto();
    responseDto.setData("Generated");
    responseDto.setSuccess(true);
    return new ResponseEntity<>(responseDto,HttpStatus.OK);
  }
}
