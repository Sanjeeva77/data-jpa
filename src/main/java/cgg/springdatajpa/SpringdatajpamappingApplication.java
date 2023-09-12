package cgg.springdatajpa;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cgg.springdatajpa.dao.CategoryRepository;
import cgg.springdatajpa.dao.ProductsRepository;
import cgg.springdatajpa.dao.QuestionRepository;
import cgg.springdatajpa.entities.Answer;
import cgg.springdatajpa.entities.Category;
import cgg.springdatajpa.entities.Products;
import cgg.springdatajpa.entities.Question;

@SpringBootApplication
public class SpringdatajpamappingApplication implements CommandLineRunner {

	private static final Logger logger=Logger.getLogger(SpringdatajpamappingApplication.class.getName());
	
	@Autowired
	private QuestionRepository questionRepo;
	
	@Autowired
	private CategoryRepository categoryRepo;
	
	@Autowired
	private ProductsRepository productsRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpamappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//create question
		/*
		 * Question q1 = new Question(); q1.setQuestionId(1213);
		 * q1.setQuestion("what is Java");
		 * 
		 * //creating answer Answer answer = new Answer(); answer.setAnswerId(243);
		 * answer.setAnswer("java is programming language"); answer.setQuestion(q1);
		 * 
		 * Answer answer1 = new Answer(); answer1.setAnswerId(244);
		 * answer1.setAnswer("java is Oops"); answer1.setQuestion(q1);
		 * 
		 * ArrayList<Answer> list = new ArrayList<>(); list.add(answer);
		 * list.add(answer1);
		 * 
		 * q1.setAnswers(list);
		 * 
		 * 
		 * 
		 * Question save=questionRepo.save(q1);
		 * logger.info("Saved question Id is:"+save.getQuestionId());
		 * 
		 * //fetching data
		 * 
		 * Question question=questionRepo.findById(1213).get();
		 * logger.info("Question Id "+question.getQuestionId());
		 * logger.info("No of answers "+question.getAnswers().size());
		 */
		 
		Category category1 = new Category();
		category1.setCategoryId(1);
        category1.setCategoryName("Mobile");
        
        Category category2 = new Category();
		category2.setCategoryId(2);
        category2.setCategoryName("Electronics");
        
        ArrayList<Category> list1=new ArrayList<>();
        list1.add(category1);
        ArrayList<Category> list11=new ArrayList<>();
        list1.add(category2);
        

        Products product1 = new Products();
        product1.setProductId(1);
        product1.setProductName("Realme");
        
        Products product2 = new Products();
        product2.setProductId(2);
        product2.setProductName("Iphone");
        
        Products product3 = new Products();
        product3.setProductId(3);
        product3.setProductName("watch");
        
        ArrayList<Products> list2=new ArrayList<>();
        list2.add(product1);
        list2.add(product2);
        list2.add(product3);
        
        ArrayList<Products> list3=new ArrayList<>();
        list3.add(product2);
        list3.add(product3);
        
        category1.setProducts(list2);
        category2.setProducts(list3);

        Category c1 = categoryRepo.save(category1);
        Category c2 = categoryRepo.save(category2);
        
        logger.info("Category id "+c1.getCategoryId());
        logger.info("Category id "+c2.getCategoryId());
        
        
        
		
	}

}
