package com.example.demo.dataaccessobject;
import com.example.demo.api.ArticleController;
import com.example.demo.model.Article;
import com.example.demo.service.ArticleService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
//TODO //###MAY NOT WORK BECAUSE OF PACKAGE NAME??###
import java.util.*;
import java.util.stream.Stream;

//this is where the ??? will implement the ArticleDao interface
//4. here we want to tell Spring that the below class needs to be instantiated so that it can be
//injected in other classes. We use repository injector
    @Repository("test dao")
    public class  ArticleAccessService implements ArticleDao {

    private static List<Article> dataB = new ArrayList<>(); //<-- why can you not put void here? returning something?
    //use enhanced for loop since dealing with collection
    //now need to implement methods from interface.
    @Override /*override requires
    corresponding method in supertype (in this case it's going to be the one in the interface.) Does this tell
    the compiler to call this method instead of interface one?*/
    public int insertArticle(UUID key, Article article) {
        dataB.add(new Article(key, article.getQKeyword(), article.getQTitle(), article.getQDate(),
                article.getDeleted(), article.getType(), article.getBy(), article.getUrl())); // <-- What does this do exactly?
        return 1; // <-- why are we returning 0? initializer for when id is inserted? so we know insertion always work
        /*Answer: we can break it down and maybe that it clarify things?
Article tmpArticle = new Article(key, article.getQKeyword(), article.getQTitle(), article.getQDate()); // Create a new copy of the provided article
dataB.add(tmpArticle); // Add the article to our list of articles */
    }

    //19. since new method is made in interface, it needs to be implemented here
    //20. need to return the database since that's where the articles are going to be after POST
    @Override
    public List<Article> selectAllArticles() {
        return dataB;
    }

    //22. create a method that can delete an article
    @Override
    public int deleteArticleByKey(UUID key) {
        Optional<Article> articleExists = selectArticleByKey(key);
        if (articleExists.isEmpty()) {
            return 0;
        } else {
            dataB.remove(articleExists.get());
        }
        return 1;
    }

    @Override
    public int addArticle(Article article) {
        return ArticleDao.super.addArticle(article);
    }

    @Override
    //26. in order to search in DB article by key first, stream DB
    public Optional<Article> selectArticleByKey (UUID key){

        return dataB.stream().filter(article -> article.getKey().equals(key)).findFirst();
    }
   /* @Override
   */ //31. this part i need to review
   /* public int updateArticleByKey(UUID key, Article update) {
        //30. lambda expression used here in order to implement event listener
        //32. this method will select a article and map it onto a value diff than it was

                //37. update (PUT) doesn't work, so need to debug
                //the { in p -> {} means that it is an interface function
                //.map is an interface feature that contains key value pairs where the keys must be unqie but there can
                // be nmore than one value, thus no sub-type of collections
                //the below .map is a STREAM MAP that returns a stream consisting of the results of applying the given
                //function to the elements of the sgtream.
                    //there are two types of map: 1)
               return selectArticleByKey(key).map(article -> {
                            int indexOfArticleToUpdate = dataB.indexOf(article);
                            //33. if this is satisfied, than article found, otherwise return 0 and nothing happens
                             //TODO: 34. I decided to replace indexOf() with contains() / cancel
                            if (indexOfArticleToUpdate >= 0) {
                                //the x.set() is an interface that is an unordered collection of objects  in which duplicate vlaues cannot be stored
                                dataB.set(indexOfArticleToUpdate, new Article(key, update.getQKeyword(), update.getQTitle(), update.getQDate(), update.getDeleted(), update.getType(), update.getBy(), update.getUrl())); // <-- what exactly is this expression doing? How does .orElse work?
                                return 1;
                            }
                      return 0;
                        }
                ).orElse(0);
    }*/

    }
