package com.ddu.practice.command;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NoticeVO {
	
	private Integer notice_num;
	private String notice_writer;
	private LocalDateTime notice_regdate;
	private String notice_title;
	private String notice_content;
	private Integer notice_views;

}
