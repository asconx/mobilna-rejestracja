namespace rejestracja
{
    public partial class MainPage : ContentPage
    {
        public MainPage()
        {
            InitializeComponent();
        }

        private void OnCounterClicked(object sender, EventArgs e)
        {
            string password = PasswordEntry.Text;
            string confirmPassword = ConfirmPasswordEntry.Text;
            string email = EmailEntry.Text;

            bool containsAt = false;
          
            // zamiast pentli mozna Contains("@") :)
            for (int i = 0; i < email.Length; i++)
            {
                if (email[i] == '@')
                {
                    containsAt = true;
                    break; 
                }
            }

            if (password != confirmPassword && !containsAt) {
                result.Text = "Hasła i e-mail nie pasują.";
                return;
            }
            
            if (password != confirmPassword)
            {
                result.Text = "Hasła nie pasują.";
                return;
            }

           
            if (!containsAt)
            {
                result.Text = "Nieprawidłowy adres e-mail.";
                return;
            }

           
            result.Text = "Wprowadzony e-mail: " + email;
        }
    }
}
