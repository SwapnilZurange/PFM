-- Insert initial users
insert into users (username, password) values ('Swapnil', 'Swapnil123'),('Mohit','Mohit123'),('Raj','Raj123');

-- Insert initial transactions
insert into transaction (user_Id, description, date, amount) values (1, 'Groceries', '2024-07-03',15000.00), (1, 'Electrical', '2024-10-05',25000.00), (2, 'Home Decor', '2024-09-02',150000.00), (3, 'Other Expenses', '2024-08-18',35000.00), (2, 'Vehicle', '2024-10-11',22000.00), (2, 'Gardening', '2024-09-10',10000.00);

-- Insert initial budgets
insert into budget (user_Id, category, amount, start_date, end_date) values (1, 'Groceries', 15000.00, '2024-07-03', '2024-07-10'), (1, 'Electrical', 25000.00, '2024-10-05', '2024-10-15'), (2, 'Gardening', 10000.00, '2024-09-10', '2024-09-10'), (3, 'Other Expenses', 35000.00, '2024-08-18', '2024-08-25'), (2, 'Vehicle', 22000.00, '2024-10-11', '2024-10-11')

