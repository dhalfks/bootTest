package com.example.demo.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

@MappedSuperclass
@EntityListeners(value = {AuditingEntityListener.class})
@Getter
abstract class TimeBased {
	
	@CreatedDate
	@Column(name="reg_at", updatable = false)
	private LocalDateTime regAt;
	
	@LastModifiedDate
	@Column(name="mod_at")
	private LocalDateTime modAt;

}
