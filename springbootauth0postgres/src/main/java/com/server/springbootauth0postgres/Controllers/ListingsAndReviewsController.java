package com.server.springbootauth0postgres.Controllers;

import java.util.List;

import com.server.springbootauth0postgres.Entities.ListingsAndReviews;
import com.server.springbootauth0postgres.Repository.ListingsAndReviewsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ListingsAndReviewsController {
    @Autowired
    private ListingsAndReviewsRepository listingsAndReviewsRepostiory;

    @GetMapping("/all_listings")
    public List<ListingsAndReviews> getAllListingsAndReviews() {
        return listingsAndReviewsRepostiory.findAll();
    }
}
