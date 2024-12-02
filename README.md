Category and Product Management API
This project implements a RESTful API for managing categories and products, including Create, Read, Update, and Delete (CRUD) operations. 
The API also establishes a one-to-many relationship between categories and products.

Features
Category Management:
CRUD operations for categories:

Get all categories with pagination.
Add, update, or delete a specific category by ID.
Product Management:
CRUD operations for products:

Get all products with pagination.
Add, update, or delete a specific product by ID.
Relationships:

Each category can have multiple products.
While fetching a product by ID, the API populates its category details.



API  ENDPOINTS

Category Endpoints
Method	    Endpoint	                         Description
GET	      /api/categories?page={page}	      Get all categories (paginated)
POST    	/api/categories                 	Create a new category
GET	      /api/categories/{id}             	Get category by ID
PUT	      /api/categories/{id}	            Update category by ID
DELETE  	/api/categories/{id}	            Delete category by ID


Product Endpoints
Method    	Endpoint	                      Description
GET	      /api/products?page={page}	    Get all products (paginated)
POST	    /api/products	                Create a new product
GET	      /api/products/{id}	          Get product by ID (with category details)
PUT	      /api/products/{id}	          Update product by ID
DELETE	  /api/products/{id}	          Delete product by ID



