//package dev.jt.mybatis;
//
//import dev.jt.mybatis.dao.BoardDao;
//import dev.jt.mybatis.dao.PostDao;
//import dev.jt.mybatis.dto.BoardDto;
//import dev.jt.mybatis.dto.PostDto;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Component
//public class TestComponent {
//    private final PostDao postDao;
//    private final BoardDao boardDao;
//    public TestComponent(
//            @Autowired PostDao postDao,
//            @Autowired BoardDao boardDao
//    ) {
//        this.postDao = postDao;
//        this.boardDao = boardDao;
//
//        BoardDto boardDto = new BoardDto();
//        boardDto.setName("new board");
//        this.boardDao.createBoard(boardDto);
//        System.out.println(boardDto.getId());
//
//        PostDto newPost = new PostDto();
//        newPost.setTitle("From Mybatis");
//        newPost.setContent("Hello Database!");
//        newPost.setWriter("hsooovn");
//        newPost.setBoard(1);
//        this.postDao.createPost(newPost);
//
//        List<PostDto> postDtoList = this.postDao.readPostAll();
//        System.out.println(postDtoList.get(postDtoList.size() - 1));
//
//        PostDto firstPost = postDtoList.get(0);
//        firstPost.setContent("Update From Mybatis!");
//        postDao.updatePost(firstPost);
//
//        System.out.println(this.postDao.readPost(firstPost.getId()));
//
//    }
//}
