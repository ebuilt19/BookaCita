🗓️ BookaCita

BookaCita is a service designed to connect customers and local businesses through simple, reliable appointment scheduling.
The initial version (v1) focuses on barbers and mechanics, helping users search, view, and book appointments directly with participating businesses.

View V1 UI online here:

https://booka-cita-ui.vercel.app/business/signup

https://booka-cita-ui.vercel.app/

**Github Repo:**

https://github.com/paulle12/BookaCitaUI

🚀 Project Overview
BookaCita aims to simplify the scheduling process for both customers and businesses.
The platform provides:
- **Customers** with an easy way to find services, view details, and book appointments.  
- **Businesses** with tools to manage availability, sign up, and update their bookings.  
- **Future versions** will include online payments, reviews, and support for more service categories.


🗺️ **API documentation for BookaCita scheduling platform**

http://localhost:8080/swagger-ui/index.html



⚙️ Planned API Endpoints

🧍 **Customer Side**
1. **Search Businesses**

    `GET /search?query=<string>&filter=<string>`

    **Description:**  
    Search for nearby barbers or mechanics matching a customer’s query.



2. **View Business**

   `GET /view?business=<businessId>`

   **Description:**
   Retrieve details for a specific business including location, services, and availability.

3. **Book Appointment**

   `POST /book/`

   `{
        “customerId”: String,
        “customerName” : String,
        “Payment” : Boolean
   }`

   
  

   Description:
   Creates a booking if the payment succeeds.
   ✅ TODO: Integrate real payment gateway (e.g., Stripe).


🏢 **Business Side**
1. **Sign Up**
   `POST /signup/`

     `{
      “businessName” : String,
      “email” : String,
      “phone” : String,
      “location” : String
      …
   }`
   
   **Description:**
   Registers a new business into the BookaCita system.

3. **Post Availability**

   `POST /availability/`

   `{
        “date”: String,
        “time”: String
   }`


   **Description:**
   Businesses can post their daily or weekly available time slots.

4. **Update Availability**

    `PUT /update/availability/`

   `{
        “date”: String,
        “time”: String
   }`

   **Description:**
   Allows a business to modify existing availability slots.

6. **View Bookings**

   `GET /booking?id=<businessId>`

   **Description:**
   Fetch all active bookings for a business.
