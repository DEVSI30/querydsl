package com.devsi.querydsl.repository;

import com.devsi.querydsl.dto.MemberSearchCondition;
import com.devsi.querydsl.dto.MemberTeamDto;

import java.util.List;

public interface MemberRepositoryCustom {
    List<MemberTeamDto> search(MemberSearchCondition condition);
}
