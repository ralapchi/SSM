package cargo.Dao;


import cargo.Model.User;

public interface IUserDao {

    User selectUser(long id);

}