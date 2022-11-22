package cat.dao;

import cat.dto.BoardDTO;

import java.util.List;
import java.util.Map;

public interface BoardDAO {
    BoardDTO select(Integer bno) throws Exception;
    int delete(Integer bno, String writer) throws Exception;
    int insert(BoardDTO dto) throws Exception;

    List<BoardDTO> selectPage(Map map) throws Exception;
    List<BoardDTO> selectAll() throws Exception;
    int deleteAll() throws Exception;
    int count() throws Exception;
}
