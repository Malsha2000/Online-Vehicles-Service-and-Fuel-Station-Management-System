/* $( document ).ready(function(){
    $("productForm").validate({
        rules:{
            pname:"required",
            pname:{
                required:true
            },

            Description:"required",
            Description:{
                required:true
            },

            Image:"required",
            Image:{
                required:true
            },

            Price:"required",
            Price:{
                required:true
            },


        },
        messages:{
            pName:"Name is Required",
            Description:"Description is Required",
            Image:"Image is Required",
            Price:"Product Price is Required",
        },

        errorElement: "em",

        errorPlacement: function(error,element)
        {
            error.addClass('invalid-feedback');
            element.closest('.form-group').append(error);
        },

        highlight:function(element,errorClass,validClass)
        {
            $(element).addClass('is-invalid').addClass('has-success has-feedback');
        },
        
        unhighlight:function(element,errorClass,validClass)
        {
            $(element).removeClass('is-invalid');
        }
    });
}); */










