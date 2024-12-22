package com.example.ims_dbms.services;

import com.example.ims_dbms.dtos.LoginRequest;
import com.example.ims_dbms.dtos.RegisterRequest;
import com.example.ims_dbms.dtos.Response;
import com.example.ims_dbms.dtos.UserDTO;
import com.example.ims_dbms.models.User;

public interface UserService {
    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);
}
