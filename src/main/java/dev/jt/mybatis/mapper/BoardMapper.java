package dev.jt.mybatis.mapper;

import dev.jt.mybatis.dto.BoardDto;

public interface BoardMapper {
    int createBoard(BoardDto dto);
}
