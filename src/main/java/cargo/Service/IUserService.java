package cargo.Service;


import cargo.Model.User;

public interface IUserService {

    public User selectUser(long userId);

}