package com.ideamall.repository;

import com.ideamall.domain.Post;
import com.ideamall.request.PostSearch;

import java.util.List;

public interface PostRepositoryCustom {
    List<Post> getList(PostSearch postSearch);
}
