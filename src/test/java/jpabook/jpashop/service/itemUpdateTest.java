package jpabook.jpashop.service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.domain.item.Book;
import jpabook.jpashop.domain.item.Item;
import jpabook.jpashop.exception.NotEnoughStockException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;

import static org.junit.Assert.fail;

@RunWith(SpringRunner.class)
@SpringBootTest
public class itemUpdateTest {

@Autowired
EntityManager em;
@Test
public void updateTest() throws Exception {

    
}


}
